
  package gen;
  public class D_Gen140 {
  		@com.google.inject.Inject
  		public D_Gen140(D_Gen141 d_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  