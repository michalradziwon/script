
  package gen;
  public class T_Gen144 {
  		@com.google.inject.Inject
  		public T_Gen144(T_Gen145 t_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  