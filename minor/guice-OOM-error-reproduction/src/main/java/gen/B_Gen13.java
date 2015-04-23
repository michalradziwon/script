
  package gen;
  public class B_Gen13 {
  		@com.google.inject.Inject
  		public B_Gen13(B_Gen14 b_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  