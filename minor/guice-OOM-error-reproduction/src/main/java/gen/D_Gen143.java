
  package gen;
  public class D_Gen143 {
  		@com.google.inject.Inject
  		public D_Gen143(D_Gen144 d_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  