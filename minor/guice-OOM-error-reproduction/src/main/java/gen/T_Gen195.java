
  package gen;
  public class T_Gen195 {
  		@com.google.inject.Inject
  		public T_Gen195(T_Gen196 t_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  