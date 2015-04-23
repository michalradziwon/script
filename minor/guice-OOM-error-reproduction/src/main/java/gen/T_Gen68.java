
  package gen;
  public class T_Gen68 {
  		@com.google.inject.Inject
  		public T_Gen68(T_Gen69 t_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  