
  package gen;
  public class T_Gen62 {
  		@com.google.inject.Inject
  		public T_Gen62(T_Gen63 t_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  