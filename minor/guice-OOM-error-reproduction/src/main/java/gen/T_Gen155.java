
  package gen;
  public class T_Gen155 {
  		@com.google.inject.Inject
  		public T_Gen155(T_Gen156 t_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  