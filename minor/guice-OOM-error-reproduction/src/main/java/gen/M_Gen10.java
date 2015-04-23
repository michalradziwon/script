
  package gen;
  public class M_Gen10 {
  		@com.google.inject.Inject
  		public M_Gen10(M_Gen11 m_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  