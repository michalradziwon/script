
  package gen;
  public class T_Gen55 {
  		@com.google.inject.Inject
  		public T_Gen55(T_Gen56 t_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  