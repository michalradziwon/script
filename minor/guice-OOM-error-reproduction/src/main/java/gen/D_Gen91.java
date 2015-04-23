
  package gen;
  public class D_Gen91 {
  		@com.google.inject.Inject
  		public D_Gen91(D_Gen92 d_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  