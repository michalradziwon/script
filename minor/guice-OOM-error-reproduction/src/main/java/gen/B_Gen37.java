
  package gen;
  public class B_Gen37 {
  		@com.google.inject.Inject
  		public B_Gen37(B_Gen38 b_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  