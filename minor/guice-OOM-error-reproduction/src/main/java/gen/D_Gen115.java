
  package gen;
  public class D_Gen115 {
  		@com.google.inject.Inject
  		public D_Gen115(D_Gen116 d_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  