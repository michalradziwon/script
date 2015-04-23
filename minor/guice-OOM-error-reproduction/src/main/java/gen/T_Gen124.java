
  package gen;
  public class T_Gen124 {
  		@com.google.inject.Inject
  		public T_Gen124(T_Gen125 t_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  