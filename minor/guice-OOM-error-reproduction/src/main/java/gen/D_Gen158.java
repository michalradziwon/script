
  package gen;
  public class D_Gen158 {
  		@com.google.inject.Inject
  		public D_Gen158(D_Gen159 d_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  