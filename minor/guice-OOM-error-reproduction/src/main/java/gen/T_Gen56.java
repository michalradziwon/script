
  package gen;
  public class T_Gen56 {
  		@com.google.inject.Inject
  		public T_Gen56(T_Gen57 t_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  