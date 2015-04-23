
  package gen;
  public class M_Gen191 {
  		@com.google.inject.Inject
  		public M_Gen191(M_Gen192 m_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  