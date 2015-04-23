
  package gen;
  public class T_Gen47 {
  		@com.google.inject.Inject
  		public T_Gen47(T_Gen48 t_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  