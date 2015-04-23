
  package gen;
  public class R_Gen30 {
  		@com.google.inject.Inject
  		public R_Gen30(R_Gen31 r_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  