
  package gen;
  public class R_Gen137 {
  		@com.google.inject.Inject
  		public R_Gen137(R_Gen138 r_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  