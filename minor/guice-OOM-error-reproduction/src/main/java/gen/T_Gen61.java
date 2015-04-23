
  package gen;
  public class T_Gen61 {
  		@com.google.inject.Inject
  		public T_Gen61(T_Gen62 t_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  