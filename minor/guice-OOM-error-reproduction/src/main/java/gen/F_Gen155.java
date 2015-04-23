
  package gen;
  public class F_Gen155 {
  		@com.google.inject.Inject
  		public F_Gen155(F_Gen156 f_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  