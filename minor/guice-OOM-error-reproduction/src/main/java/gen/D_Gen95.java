
  package gen;
  public class D_Gen95 {
  		@com.google.inject.Inject
  		public D_Gen95(D_Gen96 d_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  