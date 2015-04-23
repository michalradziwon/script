
  package gen;
  public class T_Gen168 {
  		@com.google.inject.Inject
  		public T_Gen168(T_Gen169 t_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  