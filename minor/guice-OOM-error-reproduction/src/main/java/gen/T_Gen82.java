
  package gen;
  public class T_Gen82 {
  		@com.google.inject.Inject
  		public T_Gen82(T_Gen83 t_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  