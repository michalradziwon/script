
  package gen;
  public class T_Gen125 {
  		@com.google.inject.Inject
  		public T_Gen125(T_Gen126 t_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  