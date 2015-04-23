
  package gen;
  public class D_Gen167 {
  		@com.google.inject.Inject
  		public D_Gen167(D_Gen168 d_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  