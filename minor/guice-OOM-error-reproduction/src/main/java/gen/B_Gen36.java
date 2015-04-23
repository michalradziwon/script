
  package gen;
  public class B_Gen36 {
  		@com.google.inject.Inject
  		public B_Gen36(B_Gen37 b_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  