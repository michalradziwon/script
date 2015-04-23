
  package gen;
  public class T_Gen111 {
  		@com.google.inject.Inject
  		public T_Gen111(T_Gen112 t_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  