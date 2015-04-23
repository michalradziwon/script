
  package gen;
  public class T_Gen4 {
  		@com.google.inject.Inject
  		public T_Gen4(T_Gen5 t_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  