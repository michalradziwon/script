
  package gen;
  public class R_Gen91 {
  		@com.google.inject.Inject
  		public R_Gen91(R_Gen92 r_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  