
  package gen;
  public class T_Gen99 {
  		@com.google.inject.Inject
  		public T_Gen99(T_Gen100 t_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  