
  package gen;
  public class D_Gen161 {
  		@com.google.inject.Inject
  		public D_Gen161(D_Gen162 d_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  