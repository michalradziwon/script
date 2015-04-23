
  package gen;
  public class T_Gen169 {
  		@com.google.inject.Inject
  		public T_Gen169(T_Gen170 t_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  