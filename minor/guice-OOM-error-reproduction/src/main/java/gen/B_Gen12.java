
  package gen;
  public class B_Gen12 {
  		@com.google.inject.Inject
  		public B_Gen12(B_Gen13 b_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  