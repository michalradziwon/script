
  package gen;
  public class M_Gen55 {
  		@com.google.inject.Inject
  		public M_Gen55(M_Gen56 m_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  