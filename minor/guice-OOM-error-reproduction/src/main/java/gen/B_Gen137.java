
  package gen;
  public class B_Gen137 {
  		@com.google.inject.Inject
  		public B_Gen137(B_Gen138 b_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  