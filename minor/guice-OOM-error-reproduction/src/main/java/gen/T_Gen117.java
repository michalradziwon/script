
  package gen;
  public class T_Gen117 {
  		@com.google.inject.Inject
  		public T_Gen117(T_Gen118 t_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  