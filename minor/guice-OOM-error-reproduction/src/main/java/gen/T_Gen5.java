
  package gen;
  public class T_Gen5 {
  		@com.google.inject.Inject
  		public T_Gen5(T_Gen6 t_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  