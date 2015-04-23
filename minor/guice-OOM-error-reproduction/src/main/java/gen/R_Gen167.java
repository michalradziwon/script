
  package gen;
  public class R_Gen167 {
  		@com.google.inject.Inject
  		public R_Gen167(R_Gen168 r_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  