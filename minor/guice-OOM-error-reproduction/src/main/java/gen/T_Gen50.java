
  package gen;
  public class T_Gen50 {
  		@com.google.inject.Inject
  		public T_Gen50(T_Gen51 t_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  