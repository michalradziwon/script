
  package gen;
  public class D_Gen181 {
  		@com.google.inject.Inject
  		public D_Gen181(D_Gen182 d_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  