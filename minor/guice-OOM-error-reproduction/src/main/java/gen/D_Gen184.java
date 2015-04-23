
  package gen;
  public class D_Gen184 {
  		@com.google.inject.Inject
  		public D_Gen184(D_Gen185 d_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  