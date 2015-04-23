
  package gen;
  public class F_Gen134 {
  		@com.google.inject.Inject
  		public F_Gen134(F_Gen135 f_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  