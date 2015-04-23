
  package gen;
  public class T_Gen16 {
  		@com.google.inject.Inject
  		public T_Gen16(T_Gen17 t_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  