
  package gen;
  public class T_Gen69 {
  		@com.google.inject.Inject
  		public T_Gen69(T_Gen70 t_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  