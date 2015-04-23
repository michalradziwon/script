
  package gen;
  public class T_Gen57 {
  		@com.google.inject.Inject
  		public T_Gen57(T_Gen58 t_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  