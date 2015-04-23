
  package gen;
  public class R_Gen164 {
  		@com.google.inject.Inject
  		public R_Gen164(R_Gen165 r_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  