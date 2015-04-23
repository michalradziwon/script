
  package gen;
  public class D_Gen15 {
  		@com.google.inject.Inject
  		public D_Gen15(D_Gen16 d_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  