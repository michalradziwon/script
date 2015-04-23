
  package gen;
  public class F_Gen120 {
  		@com.google.inject.Inject
  		public F_Gen120(F_Gen121 f_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  