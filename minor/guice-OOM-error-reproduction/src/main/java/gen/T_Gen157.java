
  package gen;
  public class T_Gen157 {
  		@com.google.inject.Inject
  		public T_Gen157(T_Gen158 t_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  