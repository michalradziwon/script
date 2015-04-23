
  package gen;
  public class T_Gen134 {
  		@com.google.inject.Inject
  		public T_Gen134(T_Gen135 t_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  