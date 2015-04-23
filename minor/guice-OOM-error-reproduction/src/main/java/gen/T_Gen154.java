
  package gen;
  public class T_Gen154 {
  		@com.google.inject.Inject
  		public T_Gen154(T_Gen155 t_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  