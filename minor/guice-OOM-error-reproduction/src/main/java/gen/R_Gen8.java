
  package gen;
  public class R_Gen8 {
  		@com.google.inject.Inject
  		public R_Gen8(R_Gen9 r_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  