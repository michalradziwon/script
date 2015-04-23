
  package gen;
  public class T_Gen105 {
  		@com.google.inject.Inject
  		public T_Gen105(T_Gen106 t_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  